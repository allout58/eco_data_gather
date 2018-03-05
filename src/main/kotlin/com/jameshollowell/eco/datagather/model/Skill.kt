package com.jameshollowell.eco.datagather.model

import java.util.*

/**
 * Created by James Hollowell on 3/4/2018.
 */
data class Skill(val codeName: String, val friendlyName: String, val description: String, val prerequisiteSkill: Skill?, val prerequisiteSkillLevel: Int?, val strategy: Array<Int>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Skill

        if (codeName != other.codeName) return false
        if (friendlyName != other.friendlyName) return false
        if (description != other.description) return false
        if (prerequisiteSkill != other.prerequisiteSkill) return false
        if (prerequisiteSkillLevel != other.prerequisiteSkillLevel) return false
        if (!Arrays.equals(strategy, other.strategy)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = codeName.hashCode()
        result = 31 * result + friendlyName.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + (prerequisiteSkill?.hashCode() ?: 0)
        result = 31 * result + (prerequisiteSkillLevel ?: 0)
        result = 31 * result + Arrays.hashCode(strategy)
        return result
    }
}