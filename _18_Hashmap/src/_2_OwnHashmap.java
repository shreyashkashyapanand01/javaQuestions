import java.util.LinkedList;

public class _2_OwnHashmap {
    static class MyHashmap <k,v>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            k key;
            v value;
            Node(k key , v value){
                    this.key=key;
                    this.value=value;
            }
        }

        private int n ; // the number of entries in a map
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){ //N = capacity/size of buckets array
            buckets = new LinkedList[N];
            for (int i = 0 ; i<buckets.length ; i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(k key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        public MyHashmap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        //traverses the ll and looks for a node with key, if found it's index otherwise it returns null;
        private int searchInBucket(LinkedList<Node> ll, k key){
                for(int i = 0 ; i< ll.size() ; i++){
                    if(ll.get(i).key==key){
                        return  i ;
                    }
                }
                return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket : oldBuckets){
                for(var node : bucket)
                {
                    put(node.key, node.value);
                }
            }
        }
        public int size (){ // return the number of entries in map
                return n;
        }

        public void put (k key , v value){ //insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei == -1){ // key doesn't exist , we have to insert a new node
                Node node = new Node(key , value);
                currBucket.add(node);
                n++;
            }else { //update case
                Node currNode = currBucket.get(ei);
                currNode.value=value;
            }

            if (n>= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }

        }

        public v get (k key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public v remove (k key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){//key exist
                Node currNode = currBucket.get(ei);
                v val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;

            }
            //kwy doesn;t exist
            return null;
        }

        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }


    }
    public static void main(String[] args) {
        MyHashmap<String,Integer>mp=new MyHashmap<>();
        System.out.println("testing put");

        mp.put("a",107);
        mp.put("b",105);
        mp.put("c",103);
        mp.put("d",101);

        System.out.println("testing size "+mp.size());
        mp.put("d",1011);
        System.out.println("testing size "+mp.size());

        System.out.println("testing get :- ");
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));

        System.out.println(mp.get("shreyash")); //null

        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        System.out.println("testing size "+mp.size());

        mp.put("x",61);
        mp.put("z",71);

        System.out.println("CURRENT CAPACITY = "+mp.capacity());


    }
}
