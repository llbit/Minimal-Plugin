package miniplugin;

import se.llbit.chunky.Plugin;
import se.llbit.chunky.main.Chunky;

public class MiniPlugin implements Plugin {
	public void attach(Chunky chunky) {
		System.out.println("hello from plugin");
	}
}
