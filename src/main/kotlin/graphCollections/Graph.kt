package graphCollections

interface Graph<I>:Iterable<Graph.Vertex<I>> {
    interface Vertex<I> {
        val id: I
        fun getAdjacencies(): MutableList<I>
    }

    val size: Int
    fun addVertex(id: I): Boolean
    fun addEdge(id: I, idAdj: I): I?
    fun getVertex(id: I): Vertex<I>?

}
