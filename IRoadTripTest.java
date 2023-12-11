import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

class IRoadTripTest {
    String[] myArgs = {"borders.txt", "capdist.csv", "state_name.tsv"};
    IRoadTrip r = new IRoadTrip(myArgs);
    @org.junit.jupiter.api.Test
    public void getDistanceGuatemalaMexico() {
        int distMexicoUS = r.getDistance("Guatemala", "Mexico");
        Assertions.assertEquals(distMexicoUS, 1065);
    }
    @org.junit.jupiter.api.Test
    public void getDistanceJordanArgentina() {
        int distJordanArgentina = r.getDistance("Jordan", "Argentina");
        Assertions.assertEquals(distJordanArgentina, -1);
    }

    @org.junit.jupiter.api.Test
    public void getDistanceIndiaNepal() {
        int distIndiaNepal = r.getDistance("India", "Nepal");
        Assertions.assertEquals(distIndiaNepal, 795);
    }

    @org.junit.jupiter.api.Test
    public void getDistanceChadNiger() {
        int distChadNiger = r.getDistance("Chad", "Niger");
        Assertions.assertEquals(distChadNiger, 1397);
    }
    @org.junit.jupiter.api.Test
    public void getDistanceKenyaAustralia() {
        int distChadNiger = r.getDistance("Kenya", "Australia");
        Assertions.assertEquals(distChadNiger, -1);
    }

    @org.junit.jupiter.api.Test
    void findPathColombiaArgentina() {
        List<String> ColombiaArgentina = r.findPath("Colombia", "Argentina");
        MatcherAssert.assertThat(ColombiaArgentina.get(1), containsString("Peru"));
        MatcherAssert.assertThat(ColombiaArgentina.get(1), containsString("Bolivia"));
        MatcherAssert.assertThat(ColombiaArgentina.get(1), containsString("1069 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathIndiaYemen() {
        List<String> IndiaYemen = r.findPath("India", "Yemen");
        MatcherAssert.assertThat(IndiaYemen.get(2), containsString("Iran"));
        MatcherAssert.assertThat(IndiaYemen.get(2), containsString("Iraq"));
        MatcherAssert.assertThat(IndiaYemen.get(2), containsString("698 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathNorwaySweden() {
        List<String> NorwaySweden = r.findPath("Norway", "Sweden");
        MatcherAssert.assertThat(NorwaySweden.get(0), containsString("Norway"));
        MatcherAssert.assertThat(NorwaySweden.get(0), containsString("Sweden"));
        MatcherAssert.assertThat(NorwaySweden.get(0), containsString("419 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathChinaYemen() {
        List<String> ChinaYemen = r.findPath("China", "Yemen");
        MatcherAssert.assertThat(ChinaYemen.get(3), containsString("Turkmenistan"));
        MatcherAssert.assertThat(ChinaYemen.get(3), containsString("Iran"));
        MatcherAssert.assertThat(ChinaYemen.get(3), containsString("653 km"));
    }
    @org.junit.jupiter.api.Test
    void findPathChinaAustralia() {
        List<String> ChinaAustralia = r.findPath("China", "Australia");
        Assertions.assertEquals(ChinaAustralia.size(), 0);
    }

}