package net.klonoa9x6.lunatea.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class RingDangTouSheWuSheZhongZheGeFangKuaiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide()) {
			_level.explode(immediatesourceentity, x, y, z, 4, false, Level.ExplosionInteraction.NONE);
		}
		if (world instanceof Level _level && !_level.isClientSide()) {
			_level.explode(immediatesourceentity, (new DamageSource(((Level) world).registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC))), null, x, y, z, 4, false, Level.ExplosionInteraction.NONE);
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
