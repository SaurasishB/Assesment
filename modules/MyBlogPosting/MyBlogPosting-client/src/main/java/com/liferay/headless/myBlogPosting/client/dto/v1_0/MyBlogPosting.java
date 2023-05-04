package com.liferay.headless.myBlogPosting.client.dto.v1_0;

import com.liferay.headless.myBlogPosting.client.function.UnsafeSupplier;
import com.liferay.headless.myBlogPosting.client.serdes.v1_0.MyBlogPostingSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class MyBlogPosting implements Cloneable, Serializable {

	public static MyBlogPosting toDTO(String json) {
		return MyBlogPostingSerDes.toDTO(json);
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setBody(UnsafeSupplier<String, Exception> bodyUnsafeSupplier) {
		try {
			body = bodyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String body;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	@Override
	public MyBlogPosting clone() throws CloneNotSupportedException {
		return (MyBlogPosting)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MyBlogPosting)) {
			return false;
		}

		MyBlogPosting myBlogPosting = (MyBlogPosting)object;

		return Objects.equals(toString(), myBlogPosting.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return MyBlogPostingSerDes.toJSON(this);
	}

}