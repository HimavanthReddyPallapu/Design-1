// Time Complexity : O(N) DOUBTFUL
// Space Complexity : O(N) DOUBTFUL
// Did this code successfully run on Leetcode : Yes 33/33 test cases passed.
// Any problem you faced while coding this : Not Really.


// Your code here along with comments explaining your approach

class MyHashSet {
    private final int MAX_LEN= 1000000;
    private List<Integer>[] set;
    
    public int getBucket(int key) {
        return key%MAX_LEN;
    }
    public int getPos(int key, int index)
    {
        List<Integer> temp= set[index]; //each bucket contains a list
        
        if(temp==null){
            return -1;
        }
        else
        {
            for(int i=0; i<temp.size();i++)
            {
                if(temp.get(i)==key)
                {
                    return i;
                }
            }
        }
        return -1;
        
    }

    public MyHashSet() {
        
        set=(List<Integer>[])new ArrayList[MAX_LEN];
        
    }
    
    public void add(int key) {
        
        int index=getBucket(key);
        int pos=getPos(key,index);
        
        if(pos<0)
        {
            if(set[index]==null)
            {
                set[index]=new ArrayList<Integer>();
            }
            set[index].add(key);
        }
        
    }
    
    public void remove(int key) {
        int index=getBucket(key);
        int pos=getPos(key,index);
        if(pos>=0)
        {
            set[index].remove(pos);
        }
        
    }
    
    public boolean contains(int key) {
        int index=getBucket(key);
        int pos=getPos(key,index);
        return pos>=0;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
