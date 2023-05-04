package com.liferay.headless.myBlogPosting.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.headless.myBlogPosting.client.dto.v1_0.MyBlogPosting;
import com.liferay.headless.myBlogPosting.client.http.HttpInvoker;
import com.liferay.headless.myBlogPosting.client.pagination.Page;
import com.liferay.headless.myBlogPosting.client.resource.v1_0.MyBlogPostingResource;
import com.liferay.headless.myBlogPosting.client.serdes.v1_0.MyBlogPostingSerDes;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author me
 * @generated
 */
@Generated("")
public abstract class BaseMyBlogPostingResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_myBlogPostingResource.setContextCompany(testCompany);

		MyBlogPostingResource.Builder builder = MyBlogPostingResource.builder();

		myBlogPostingResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		MyBlogPosting myBlogPosting1 = randomMyBlogPosting();

		String json = objectMapper.writeValueAsString(myBlogPosting1);

		MyBlogPosting myBlogPosting2 = MyBlogPostingSerDes.toDTO(json);

		Assert.assertTrue(equals(myBlogPosting1, myBlogPosting2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		MyBlogPosting myBlogPosting = randomMyBlogPosting();

		String json1 = objectMapper.writeValueAsString(myBlogPosting);
		String json2 = MyBlogPostingSerDes.toJSON(myBlogPosting);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		MyBlogPosting myBlogPosting = randomMyBlogPosting();

		myBlogPosting.setBody(regex);
		myBlogPosting.setTitle(regex);

		String json = MyBlogPostingSerDes.toJSON(myBlogPosting);

		Assert.assertFalse(json.contains(regex));

		myBlogPosting = MyBlogPostingSerDes.toDTO(json);

		Assert.assertEquals(regex, myBlogPosting.getBody());
		Assert.assertEquals(regex, myBlogPosting.getTitle());
	}

	@Test
	public void testGetAllMyBlogPost() throws Exception {
		Page<MyBlogPosting> page = myBlogPostingResource.getAllMyBlogPost();

		long totalCount = page.getTotalCount();

		MyBlogPosting myBlogPosting1 = testGetAllMyBlogPost_addMyBlogPosting(
			randomMyBlogPosting());

		MyBlogPosting myBlogPosting2 = testGetAllMyBlogPost_addMyBlogPosting(
			randomMyBlogPosting());

		page = myBlogPostingResource.getAllMyBlogPost();

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(myBlogPosting1, (List<MyBlogPosting>)page.getItems());
		assertContains(myBlogPosting2, (List<MyBlogPosting>)page.getItems());
		assertValid(page);

		myBlogPostingResource.deleteMyBlogPosting(myBlogPosting1.getId());

		myBlogPostingResource.deleteMyBlogPosting(myBlogPosting2.getId());
	}

	protected MyBlogPosting testGetAllMyBlogPost_addMyBlogPosting(
			MyBlogPosting myBlogPosting)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPostMyBlogPost() throws Exception {
		MyBlogPosting randomMyBlogPosting = randomMyBlogPosting();

		MyBlogPosting postMyBlogPosting = testPostMyBlogPost_addMyBlogPosting(
			randomMyBlogPosting);

		assertEquals(randomMyBlogPosting, postMyBlogPosting);
		assertValid(postMyBlogPosting);
	}

	protected MyBlogPosting testPostMyBlogPost_addMyBlogPosting(
			MyBlogPosting myBlogPosting)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteMyBlogPosting() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		MyBlogPosting myBlogPosting =
			testDeleteMyBlogPosting_addMyBlogPosting();

		assertHttpResponseStatusCode(
			204,
			myBlogPostingResource.deleteMyBlogPostingHttpResponse(
				myBlogPosting.getId()));
	}

	protected MyBlogPosting testDeleteMyBlogPosting_addMyBlogPosting()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteMyBlogPosting() throws Exception {
		MyBlogPosting myBlogPosting =
			testGraphQLDeleteMyBlogPosting_addMyBlogPosting();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteMyBlogPosting",
						new HashMap<String, Object>() {
							{
								put("myBlogPostingId", myBlogPosting.getId());
							}
						})),
				"JSONObject/data", "Object/deleteMyBlogPosting"));
	}

	protected MyBlogPosting testGraphQLDeleteMyBlogPosting_addMyBlogPosting()
		throws Exception {

		return testGraphQLMyBlogPosting_addMyBlogPosting();
	}

	@Test
	public void testGetMyBlogPost() throws Exception {
		Long myBlogPostingId = testGetMyBlogPost_getMyBlogPostingId();
		Long irrelevantMyBlogPostingId =
			testGetMyBlogPost_getIrrelevantMyBlogPostingId();

		Page<MyBlogPosting> page = myBlogPostingResource.getMyBlogPost(
			myBlogPostingId);

		Assert.assertEquals(0, page.getTotalCount());

		if (irrelevantMyBlogPostingId != null) {
			MyBlogPosting irrelevantMyBlogPosting =
				testGetMyBlogPost_addMyBlogPosting(
					irrelevantMyBlogPostingId, randomIrrelevantMyBlogPosting());

			page = myBlogPostingResource.getMyBlogPost(
				irrelevantMyBlogPostingId);

			Assert.assertEquals(1, page.getTotalCount());

			assertEquals(
				Arrays.asList(irrelevantMyBlogPosting),
				(List<MyBlogPosting>)page.getItems());
			assertValid(page);
		}

		MyBlogPosting myBlogPosting1 = testGetMyBlogPost_addMyBlogPosting(
			myBlogPostingId, randomMyBlogPosting());

		MyBlogPosting myBlogPosting2 = testGetMyBlogPost_addMyBlogPosting(
			myBlogPostingId, randomMyBlogPosting());

		page = myBlogPostingResource.getMyBlogPost(myBlogPostingId);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(myBlogPosting1, myBlogPosting2),
			(List<MyBlogPosting>)page.getItems());
		assertValid(page);

		myBlogPostingResource.deleteMyBlogPosting(myBlogPosting1.getId());

		myBlogPostingResource.deleteMyBlogPosting(myBlogPosting2.getId());
	}

	protected MyBlogPosting testGetMyBlogPost_addMyBlogPosting(
			Long myBlogPostingId, MyBlogPosting myBlogPosting)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long testGetMyBlogPost_getMyBlogPostingId() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long testGetMyBlogPost_getIrrelevantMyBlogPostingId()
		throws Exception {

		return null;
	}

	@Test
	public void testUpdateMyBlogPosting() throws Exception {
		MyBlogPosting postMyBlogPosting =
			testUpdateMyBlogPosting_addMyBlogPosting();

		MyBlogPosting randomMyBlogPosting = randomMyBlogPosting();

		MyBlogPosting putMyBlogPosting =
			myBlogPostingResource.updateMyBlogPosting(
				postMyBlogPosting.getId(), randomMyBlogPosting);

		assertEquals(randomMyBlogPosting, putMyBlogPosting);
		assertValid(putMyBlogPosting);

		MyBlogPosting getMyBlogPosting =
			myBlogPostingResource.updateMyBlogPosting(putMyBlogPosting.getId());

		assertEquals(randomMyBlogPosting, getMyBlogPosting);
		assertValid(getMyBlogPosting);
	}

	protected MyBlogPosting testUpdateMyBlogPosting_addMyBlogPosting()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected MyBlogPosting testGraphQLMyBlogPosting_addMyBlogPosting()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		MyBlogPosting myBlogPosting, List<MyBlogPosting> myBlogPostings) {

		boolean contains = false;

		for (MyBlogPosting item : myBlogPostings) {
			if (equals(myBlogPosting, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			myBlogPostings + " does not contain " + myBlogPosting, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		MyBlogPosting myBlogPosting1, MyBlogPosting myBlogPosting2) {

		Assert.assertTrue(
			myBlogPosting1 + " does not equal " + myBlogPosting2,
			equals(myBlogPosting1, myBlogPosting2));
	}

	protected void assertEquals(
		List<MyBlogPosting> myBlogPostings1,
		List<MyBlogPosting> myBlogPostings2) {

		Assert.assertEquals(myBlogPostings1.size(), myBlogPostings2.size());

		for (int i = 0; i < myBlogPostings1.size(); i++) {
			MyBlogPosting myBlogPosting1 = myBlogPostings1.get(i);
			MyBlogPosting myBlogPosting2 = myBlogPostings2.get(i);

			assertEquals(myBlogPosting1, myBlogPosting2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<MyBlogPosting> myBlogPostings1,
		List<MyBlogPosting> myBlogPostings2) {

		Assert.assertEquals(myBlogPostings1.size(), myBlogPostings2.size());

		for (MyBlogPosting myBlogPosting1 : myBlogPostings1) {
			boolean contains = false;

			for (MyBlogPosting myBlogPosting2 : myBlogPostings2) {
				if (equals(myBlogPosting1, myBlogPosting2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				myBlogPostings2 + " does not contain " + myBlogPosting1,
				contains);
		}
	}

	protected void assertValid(MyBlogPosting myBlogPosting) throws Exception {
		boolean valid = true;

		if (myBlogPosting.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("body", additionalAssertFieldName)) {
				if (myBlogPosting.getBody() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (myBlogPosting.getTitle() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<MyBlogPosting> page) {
		boolean valid = false;

		java.util.Collection<MyBlogPosting> myBlogPostings = page.getItems();

		int size = myBlogPostings.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.liferay.headless.myBlogPosting.dto.v1_0.MyBlogPosting.
						class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		MyBlogPosting myBlogPosting1, MyBlogPosting myBlogPosting2) {

		if (myBlogPosting1 == myBlogPosting2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("body", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						myBlogPosting1.getBody(), myBlogPosting2.getBody())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						myBlogPosting1.getId(), myBlogPosting2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("title", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						myBlogPosting1.getTitle(), myBlogPosting2.getTitle())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_myBlogPostingResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_myBlogPostingResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, MyBlogPosting myBlogPosting) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("body")) {
			sb.append("'");
			sb.append(String.valueOf(myBlogPosting.getBody()));
			sb.append("'");

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("title")) {
			sb.append("'");
			sb.append(String.valueOf(myBlogPosting.getTitle()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected MyBlogPosting randomMyBlogPosting() throws Exception {
		return new MyBlogPosting() {
			{
				body = StringUtil.toLowerCase(RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				title = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected MyBlogPosting randomIrrelevantMyBlogPosting() throws Exception {
		MyBlogPosting randomIrrelevantMyBlogPosting = randomMyBlogPosting();

		return randomIrrelevantMyBlogPosting;
	}

	protected MyBlogPosting randomPatchMyBlogPosting() throws Exception {
		return randomMyBlogPosting();
	}

	protected MyBlogPostingResource myBlogPostingResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = _getSuperClass(source.getClass());

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					sourceClass.getDeclaredFields()) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				Method setMethod = _getMethod(
					targetClass, field.getName(), "set",
					getMethod.getReturnType());

				setMethod.invoke(target, getMethod.invoke(source));
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Class<?> _getSuperClass(Class<?> clazz) {
			Class<?> superClass = clazz.getSuperclass();

			if ((superClass == null) || (superClass == Object.class)) {
				return clazz;
			}

			return superClass;
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseMyBlogPostingResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private
		com.liferay.headless.myBlogPosting.resource.v1_0.MyBlogPostingResource
			_myBlogPostingResource;

}