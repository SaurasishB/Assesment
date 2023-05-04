package com.liferay.headless.myBlogPosting.client.serdes.v1_0;

import com.liferay.headless.myBlogPosting.client.dto.v1_0.MyBlogPosting;
import com.liferay.headless.myBlogPosting.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class MyBlogPostingSerDes {

	public static MyBlogPosting toDTO(String json) {
		MyBlogPostingJSONParser myBlogPostingJSONParser =
			new MyBlogPostingJSONParser();

		return myBlogPostingJSONParser.parseToDTO(json);
	}

	public static MyBlogPosting[] toDTOs(String json) {
		MyBlogPostingJSONParser myBlogPostingJSONParser =
			new MyBlogPostingJSONParser();

		return myBlogPostingJSONParser.parseToDTOs(json);
	}

	public static String toJSON(MyBlogPosting myBlogPosting) {
		if (myBlogPosting == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (myBlogPosting.getBody() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"body\": ");

			sb.append("\"");

			sb.append(_escape(myBlogPosting.getBody()));

			sb.append("\"");
		}

		if (myBlogPosting.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(myBlogPosting.getId());
		}

		if (myBlogPosting.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(myBlogPosting.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		MyBlogPostingJSONParser myBlogPostingJSONParser =
			new MyBlogPostingJSONParser();

		return myBlogPostingJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(MyBlogPosting myBlogPosting) {
		if (myBlogPosting == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (myBlogPosting.getBody() == null) {
			map.put("body", null);
		}
		else {
			map.put("body", String.valueOf(myBlogPosting.getBody()));
		}

		if (myBlogPosting.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(myBlogPosting.getId()));
		}

		if (myBlogPosting.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(myBlogPosting.getTitle()));
		}

		return map;
	}

	public static class MyBlogPostingJSONParser
		extends BaseJSONParser<MyBlogPosting> {

		@Override
		protected MyBlogPosting createDTO() {
			return new MyBlogPosting();
		}

		@Override
		protected MyBlogPosting[] createDTOArray(int size) {
			return new MyBlogPosting[size];
		}

		@Override
		protected void setField(
			MyBlogPosting myBlogPosting, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "body")) {
				if (jsonParserFieldValue != null) {
					myBlogPosting.setBody((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					myBlogPosting.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					myBlogPosting.setTitle((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}