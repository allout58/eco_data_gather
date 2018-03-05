package com.jameshollowell.eco.datagather.model

import java.util.*

/**
 * Created by James Hollowell on 3/4/2018.
 */
data class Recipe(val requiredSkill: Skill?, val requiredSkillLevel: Int = 0, val input: Array<CraftingElement>, val products: Array<CraftingElement>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Recipe

        if (requiredSkill != other.requiredSkill) return false
        if (requiredSkillLevel != other.requiredSkillLevel) return false
        if (!Arrays.equals(input, other.input)) return false
        if (!Arrays.equals(products, other.products)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = requiredSkill?.hashCode() ?: 0
        result = 31 * result + requiredSkillLevel
        result = 31 * result + Arrays.hashCode(input)
        result = 31 * result + Arrays.hashCode(products)
        return result
    }
}