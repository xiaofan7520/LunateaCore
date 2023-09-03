
package net.klonoa9x6.lunatea.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.klonoa9x6.lunatea.procedures.RingDangTouSheWuSheZhongZheGeFangKuaiProcedure;
import net.klonoa9x6.lunatea.init.LunateaModItems;
import net.klonoa9x6.lunatea.init.LunateaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RingEntity extends AbstractArrow implements ItemSupplier {
	public RingEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(LunateaModEntities.RING.get(), world);
	}

	public RingEntity(EntityType<? extends RingEntity> type, Level world) {
		super(type, world);
	}

	public RingEntity(EntityType<? extends RingEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RingEntity(EntityType<? extends RingEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(LunateaModItems.RING.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.SPECTRAL_ARROW);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		RingDangTouSheWuSheZhongZheGeFangKuaiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entity, this);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RingDangTouSheWuSheZhongZheGeFangKuaiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity(), this);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		RingDangTouSheWuSheZhongZheGeFangKuaiProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ(), this.getOwner(), this);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static RingEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RingEntity entityarrow = new RingEntity(LunateaModEntities.RING.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static RingEntity shoot(LivingEntity entity, LivingEntity target) {
		RingEntity entityarrow = new RingEntity(LunateaModEntities.RING.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.8f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
