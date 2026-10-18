package com.example.zombiemutantsurvival.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Mutant extends Monster {
    public Mutant(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }
}