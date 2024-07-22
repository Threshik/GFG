class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> res = new ArrayList<>();
        TreeMap<Integer,Integer> t = new TreeMap<>();
        
        for(int ele:arr1)
        {
            t.put(ele,1);
        }
        for(int ele:arr2)
        {
            if(t.containsKey(ele) && t.get(ele)==1)
            t.put(ele,2);
        }
        for(int ele:arr3)
        {
            if(t.containsKey(ele) && t.get(ele)==2)
            t.put(ele,3);
        }
        for(int ele:t.keySet())
        {
            if(t.get(ele)==3)
            {
                res.add(ele);
            }
        }
        return res;
    }
}
