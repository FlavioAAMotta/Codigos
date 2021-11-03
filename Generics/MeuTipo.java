public class MeuTipo<T extends Number> {
    T num;
    MeuTipo(T obj){
        this.num = obj;
    }

    boolean absEqual(MeuTipo<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()) ){
            return true;
        }
        return false;
    }
}
