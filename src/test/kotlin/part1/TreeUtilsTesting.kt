import part1.Node


val cmp={ i1: Int, i2: Int -> i1 - i2 }
fun emptyBST(): Node<Int>?=null

fun singleNodeBST(i:Int): Node<Int>?=add(null,i,cmp)

fun populatedBST(array:IntArray): Node<Int>? {
    var tree: Node<Int>? = null
    for (i in array) tree = add(tree, i, cmp)
    return tree
}

fun populatedTree(array:IntArray,l:Int,r:Int): Node<Int>? {
    if(r<l) return null
    val mid=(l+r)/2
    val root=Node(array[mid] ,populatedTree(array,l,mid-1) ,populatedTree(array,mid+1,r))
    return root
}


fun <E> add(root: Node<E>?, e: E, cmp: Comparator<E>): Node<E> {
    var root = root
    if (root == null) root = Node(e,null,null)
    else if (cmp.compare(e, root.item) < 0) root.left = add(root.left, e, cmp)
    else root.right = add(root.right, e, cmp)
    return root
}



















