package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void ifWhatIsName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Example"));
    }

    @Test
    public void ifSumYears() throws Exception {
        assertThat(queryProcessor.process("what is 2014 plus 2010"), containsString("4024"));
    }

    @Test
    public void ifSum207Plus2010() throws Exception {
        assertThat(queryProcessor.process("what is 207 plus 2010"), containsString("2217"));
    }

    @Test
    public void isCubeSquare507Vs64() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is both a square and a cube: 507, 64"), containsString("64"));
    }

}
