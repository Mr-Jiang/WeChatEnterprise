package wx.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: ThreadPoolManager
 * <p>
 * Description: 线程池管理类
 * <p>
 * Copyright: Copyright (c) 2018
 * <p>
 * GitHub:<a href="https://github.com/Mr-Jiang">https://github.com/Mr-Jiang</a>
 * <p>
 * Blog:
 * <a href="https://blog.csdn.net/jspping?viewmode=contents">https://blog.csdn.
 * net/jspping?viewmode=contents</a>
 * <p>
 * Personal Home Page:
 * <a href="http://www.engineer-jsp.cn/">http://www.engineer-jsp.cn/</a>
 * 
 * @author <a href="https://github.com/Mr-Jiang">Mr-Jiang</a>
 * @date 2018.08.28 15:44
 */
public class ThreadPoolManager {

	/** 线程池对象 */
	private ExecutorService mExecutorService;

	/** 线程池最大并发数量 */
	private static final int MAX_THREAD_TOTAL = 5;

	private static final class ThreadPoolFactory {
		/**
		 * 静态私有内部类实例
		 */
		private static final ThreadPoolManager mThreadPoolManager = new ThreadPoolManager();
	}

	private ThreadPoolManager() {
		// TODO Auto-generated constructor stub
		initThreadPool();
	}

	/**
	 * 获取线程池管理实例对象
	 * 
	 * @return 线程池管理实例对象
	 */
	public static ThreadPoolManager getManager() {
		return ThreadPoolFactory.mThreadPoolManager;
	}

	/**
	 * 初始化一个线程池对象
	 */
	private void initThreadPool() {

		/**
		 * 关于线程池的介绍
		 * <p>
		 * Java通过Executors提供四种线程池，分别为
		 * <p>
		 * newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
		 * <p>
		 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
		 * <p>
		 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行
		 * <p>
		 * newSingleThreadExecutor
		 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
		 */

		mExecutorService = Executors.newFixedThreadPool(MAX_THREAD_TOTAL);
	}

	/**
	 * 新线程入池
	 * 
	 * @param run
	 *            Runnable
	 */
	public void postRunnable(Runnable run) {
		mExecutorService.execute(run);
	}
}
