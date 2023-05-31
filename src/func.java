import java.io.Serializable;

public class func implements Serializable {
    double x;
    double y;
    func (double x){
        this.x = x;
    }
    void matimatic(){
        y = x - Math.sin(x);
    }
}
