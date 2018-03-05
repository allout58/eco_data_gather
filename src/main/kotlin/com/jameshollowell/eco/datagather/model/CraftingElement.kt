package com.jameshollowell.eco.datagather.model

/**
 * Created by James Hollowell on 3/4/2018.
 */
data class CraftingElement(val item: Item, val baseQuantity: Int, val efficiencySkill: Skill?, val baseTime: Int, val speedSkill: Skill?, val station: Item)