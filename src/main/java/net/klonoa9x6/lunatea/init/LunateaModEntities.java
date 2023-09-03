
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.klonoa9x6.lunatea.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.klonoa9x6.lunatea.entity.RingEntity;
import net.klonoa9x6.lunatea.LunateaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LunateaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LunateaMod.MODID);
	public static final RegistryObject<EntityType<RingEntity>> RING = register("projectile_ring",
			EntityType.Builder.<RingEntity>of(RingEntity::new, MobCategory.MISC).setCustomClientFactory(RingEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
