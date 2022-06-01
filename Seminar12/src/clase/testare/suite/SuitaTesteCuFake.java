package clase.testare.suite;

import clase.testare.categorii.TesteBoundary;
import clase.testare.categorii.TesteCuFake;
import clase.testare.categorii.TestePoateRezerva;
import clase.testare.teste.AgentieTurismTest;
import clase.testare.teste.PachetTuristicTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteCuFake.class)
@Categories.ExcludeCategory({TesteBoundary.class, TestePoateRezerva.class})
public class SuitaTesteCuFake {

}
