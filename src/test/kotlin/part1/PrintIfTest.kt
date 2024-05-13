package part1

import emptyBST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import populatedBST
import singleNodeBST

class PrintIfTest {
    @Test
    fun printIfTest_empty_tree() {
        val tree = emptyBST()
        assertEquals(0, printIf(tree) {i:Int-> i%2==0})
    }

    @Test
    fun printIfTest_single_element() {
        var tree = singleNodeBST(10)
        val predicate={i:Int-> i%2==0}
        assertEquals(1, printIf(tree,predicate))
        tree = singleNodeBST(9)
        assertEquals(0, printIf(tree,predicate))
    }

    @Test
    fun printIfTest_some_tree(){
        var tree =populatedBST(intArrayOf(40,5,20,45,30,60,55))
        val predicateEven={i:Int-> i%2==0}
        val predicateOdd={i:Int-> i%2!=0}
        assertEquals(4, printIf(tree,predicateEven))
        assertEquals(3, printIf(tree,predicateOdd))
    }

}