package org.springframework.xd.samples;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/feed.xml", "test-context.xml"})
public class FeedSourceModuleTest {
	
	@Autowired
	FeedCache feedCache;
	
	@Test
	public void testFeedPolling() throws Exception {
		assertNotNull(feedCache.entries.poll(5, TimeUnit.SECONDS));
	}

}
