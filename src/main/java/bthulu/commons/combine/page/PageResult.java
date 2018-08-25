package bthulu.commons.combine.page;

import java.util.Collection;
import java.util.Collections;

/**
 * 分页结果, 仅含必要的返回信息
 * @author gejian at 2018/8/25 14:56
 */
public class PageResult<T> {
	private Collection<T> content = Collections.emptyList();
	private long total;

	public PageResult() {
	}

	public PageResult(Collection<T> content) {
		this.content = content;
	}

	public PageResult(Collection<T> content, long total) {
		this.content = content;
		this.total = total;
	}

	public Collection<T> getContent() {
		return content;
	}

	public void setContent(Collection<T> content) {
		this.content = content;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PageResult{" + "content=" + content + ", total=" + total + '}';
	}
}
