package cts.seminar2;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}
