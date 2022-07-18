import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static void safeMethod() {
        List<SoftReference<Object>> softReferenceData = new ArrayList<>();
        softReferenceData.add(new SoftReference<>(new Object()));
        Object strong = softReferenceData.get(0).get();
        if (strong != null) {
            System.out.println(softReferenceData.get(0).get());
        } else {
            System.out.println("GC уже удалил объект");
        }
        System.out.println(strong);
    }

    public static void main(String[] args) {
        safeMethod();
    }
}
