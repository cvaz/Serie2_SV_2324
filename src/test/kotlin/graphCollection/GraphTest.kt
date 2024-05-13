package graphCollection

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class GraphTest {

    /*    @Test
    fun graph_empty() {
         val graph = GraphStructure<Int>()
         assertEquals(0, graph.size)
     }

     @Test
     fun graph_singleton() {
         val graph = GraphStructure<Int>()
         graph.addVertex(1)
         graph.addVertex(1)
         assertEquals(1, graph.size)
        graph.addEdge(1, 2)
         graph.addEdge(1, 3)
          graph.addEdge(1, 4)
         assertEquals(1, graph.size)
     }

     @Test
     fun graph_equalElements() {
         val graph = GraphStructure<Int>()
         for (id in 1..4)
             graph.addVertex(id)
         assertEquals(4, graph.size)
         for (id in 1..4) for (id2 in 1..4)
             if (id2 != id) graph.addEdge(id, id2)
         for (id in 1..4) {
             val setE: MutableSet<Int> = mutableSetOf()
             val vertex=graph.getVertex(id)
             if(vertex!=null)
                for (e in vertex.getAdjacencies())
                  setE.add(e)
             val set2 = mutableSetOf(1, 2, 3, 4)
             set2.remove(id)
             assertEquals(setE, set2)
         }
     }

     @Test
     fun graph_someElements() {
         val graph = GraphStructure<Int>()
         for (id in 0..99)
             graph.addVertex(id)
         assertEquals(100, graph.size)
         for (id in 0..99) for (id2 in 0..99)
             if (id2 != id) graph.addEdge(id, id2)
         for (id in 0..99) {
             val adjList = graph.getVertex(id)
             if (adjList != null) assertEquals(99, adjList.getAdjacencies().size)
         }
         for (id in 0..99) for (id2 in 0..99)
             if (id2 != id) graph.addEdge(id, id2)
         for (id in 0..99) {
             val adjList = graph.getVertex(id)
             if (adjList != null) assertEquals(198, adjList.getAdjacencies().size)
         }
     }
     */

}
