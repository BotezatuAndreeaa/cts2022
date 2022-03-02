package cts.clase;
import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
      public List<Aplicant> readAplicant(String file) throws FileNotFoundException;

}
