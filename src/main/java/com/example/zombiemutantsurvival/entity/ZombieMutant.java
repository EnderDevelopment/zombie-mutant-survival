package com.example.zombiemutantsurvival.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;

public class ZombieMutant extends Zombie {
    public ZombieMutant(EntityType<? extends Zombie> entityType, Level level) {
        super(entityType, level);
    }
}