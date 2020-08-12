public class RectCover {
    public int RectCover(int target) {
        if(target<3){
            return target;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
}