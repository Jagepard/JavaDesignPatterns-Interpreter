package Behavioral.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {
    private InterpreterInterface interpreter;

    @BeforeEach
    void setUp() {
        this.interpreter = new Interpreter();
        ((Interpreter) this.interpreter).addAlbumToRegistry(new Album("Korn", "Untouchables"));
        ((Interpreter) this.interpreter).addAlbumToRegistry(new Album("Deftones", "Adrenaline"));
    }

    @Test
    void testAlbum() {
        assertEquals(this.interpreter.interpret("album 1"), "Untouchables ");
        assertEquals(this.interpreter.interpret("1 album"), "Untouchables ");
        assertEquals(this.interpreter.interpret("album 2"), "Adrenaline ");
        assertEquals(this.interpreter.interpret("2 album"), "Adrenaline ");
    }

    @Test
    void testAuthor() {
        assertEquals(this.interpreter.interpret("author 1"), "Korn ");
        assertEquals(this.interpreter.interpret("1 author"), "Korn ");
        assertEquals(this.interpreter.interpret("author 2"), "Deftones ");
        assertEquals(this.interpreter.interpret("2 author"), "Deftones ");
    }
}