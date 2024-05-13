package part1

import emptyBST
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import populatedTree
import singleNodeBST

class IsChildrenSumTest {
    @Test
    fun isChildren_empty_trees() {
        val tree = emptyBST()
        assertTrue(isChildrenSum(tree))
    }

    @Test
    fun isChildren_singleNode_tree(){
        val tree=singleNodeBST(10)
        assertTrue(isChildrenSum(tree))
    }

    @Test
    fun isChildren_twoNodes_tree(){
        var tree1=populatedTree(intArrayOf(4,4),0,1)
        assertTrue(isChildrenSum(tree1))
        tree1=populatedTree(intArrayOf(3,4),0,1)
        assertFalse(isChildrenSum(tree1))
    }

    @Test
    fun isChildren_threeNodes_tree(){
        var tree1=populatedTree(intArrayOf(1,4,3),0,2)
        assertTrue(isChildrenSum(tree1))
        tree1=populatedTree(intArrayOf(3,1,1),0,2)
        assertFalse(isChildrenSum(tree1))
    }

    @Test
    fun isChildren_sameNodes_tree(){
        var tree1=populatedTree(intArrayOf(7,12,5,25,6,13,7),0,6)
        assertTrue(isChildrenSum(tree1))
    }


}