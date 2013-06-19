package org.springframework.xd.samples;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

import com.sun.syndication.feed.synd.SyndEntry;

public class FeedCache {

	final BlockingDeque<SyndEntry> entries = new LinkedBlockingDeque<SyndEntry>(99);

	public void add(SyndEntry entry) {
		entries.add(entry);
	}
}
