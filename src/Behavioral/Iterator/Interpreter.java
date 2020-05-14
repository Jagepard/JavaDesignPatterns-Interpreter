/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Interpreter implements InterpreterInterface {
    private final List<AlbumInterface> registry = new ArrayList<>();

    @Override
    public String interpret(String input) {
        String[] exploded = input.split(" ");

        for (String value : exploded) {
            if (this.isNumeric(value)) {
                int number = Integer.parseInt(value) - 1;
                return this.getDataFromRegistry(exploded, this.registry.get(number));
            }
        }

        return input;
    }

    public void addAlbumToRegistry(AlbumInterface album) {
        this.registry.add(album);
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    private String getDataFromRegistry(String[] exploded, AlbumInterface item)
    {
        StringBuilder output = new StringBuilder();

        for (String value : exploded) {
            if (value.equals("album")) output.append(item.getName()).append(" ");
            if (value.equals("author")) output.append(item.getAuthor()).append(" ");
        }

        return output.toString();
    }
}
