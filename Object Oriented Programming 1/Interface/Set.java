public class Set implements InterfaceSet{
    
    private int [] set;
    private int count;
    
    public Set(){
        set = new int [MAX];
        count = 0;
    }

    public Set (int size){

        count = 0;
        set = new int [size];
    }

    public void add (int e){

        if(count<MAX){ 
            if(!isElementOf(e))
                set[count++] = e;
            if(e==0)
                count--;
        }
    }

    public void add (int e, int size){
    
        if(count<size){
            if(!isElementOf(e))
                set[count++]=e;
            if(e==0)
                count--;
        }
     }

    public void display (){
        for (int i = 0; i <count; i++) {
           System.out.println(set[i]);
        }
    }

    
    public int count(){
        return count;
    }


    public boolean isElementOf(int e){
        boolean bool = false;
        for (int i = 0; i <count; i++) {
            if(set[i]==e){
                bool = true;
                break;
            }
        }
        return bool;
    }

    public int getElement(int index){
        index = set[index];
        return index;
    }

    public Set union(Set s){

        int both = this.set.length + s.count();
        int i=0;
        Set union = new Set(both);

			for(;i<this.set.length;i++)
                union.add(this.set[i]);
            
			for(int j=0;j<s.count();j++){
                union.add(s.set[j],both);
                i++;
             }
        return union;
	}
}
   
