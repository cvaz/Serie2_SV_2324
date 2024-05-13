package part1

import emptyBST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import populatedBST
import singleNodeBST

class CountBetweenTest {
    @Test
    fun countBetween_empty_trees() {
        val tree = emptyBST()
        assertEquals(0, countBetween(tree, 0, 10))
    }

    @Test
    fun countBetween_singleNode_tree() {
        var tree = singleNodeBST(20)
        assertEquals(0, countBetween(tree, 0, 10))
        tree = singleNodeBST(5)
        assertEquals(1, countBetween(tree, 0, 10))
    }

    @Test
    fun countBetween_some_tree() {
        var tree = populatedBST(intArrayOf(40,20,30,60,10,15,70,55,80))
        assertEquals(8, countBetween(tree, 10, 70))
        assertEquals(1, countBetween(tree, 0, 10))
        assertEquals(0, countBetween(tree, 0, 5))
        assertEquals(0, countBetween(tree, 90, 95))
        assertEquals(2, countBetween(tree, 50, 65))
    }

}