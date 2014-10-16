package kata3;

public class HystogramViewer<Type> {
    public void print (Hystogram<Type> hystogram){
        for(Type keySet : hystogram.keySet()){
            System.out.println(keySet + "-->" + hystogram.get(keySet));
        }
    }
}
