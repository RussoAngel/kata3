package kata3;

public class HystogramBuilder<Type> {
    
    public Hystogram <Type> build (Type[] types){
        Hystogram <Type> result = new Hystogram <>();
        for (Type type: types){
            result.put(type, result.get(type)+ 1);
        }
        return result;
    }       
}

