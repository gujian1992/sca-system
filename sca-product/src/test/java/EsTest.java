//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import org.elasticsearch.action.get.GetRequest;
//import org.elasticsearch.action.get.GetResponse;
//import org.elasticsearch.action.index.IndexRequest;
//import org.elasticsearch.action.index.IndexResponse;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.client.indices.CreateIndexRequest;
//import org.elasticsearch.client.indices.CreateIndexResponse;
//import org.elasticsearch.common.xcontent.XContentType;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import product.ProductApplication;
//
//import java.io.IOException;
//
///**
// * @author: lyk
// * @date: 2022/2/12 10:53
// * @description:
// */
//@SpringBootTest(classes = ProductApplication.class)
//@RunWith(SpringRunner.class)
//public class EsTest {
//    @Autowired
//    private RestHighLevelClient restHighLevelClient;
//    // 测试创建索引
//    @Test
//    public void createESIndext() throws IOException {
//        // 创建索引请求
//        CreateIndexRequest request = new CreateIndexRequest("springboot-sca");
//        // 通过高级客户端调用相关索引客户端，并执行请求
//        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
//        // 输出请求
//        System.out.println(createIndexResponse);
//    }
//    @Test
//    public void createESDocument() throws IOException {
//        JSONObject stu=new JSONObject();
//        stu.put("age",11);
//        stu.put("name","qinshan");
//        // 创建索引相关请求
//        IndexRequest request = new IndexRequest("xiaoming_index");
//        // 配置请求相关参数
//        request.id("1");
//        request.timeout("1s");
//        request.source(JSON.toJSONString(stu), XContentType.JSON);
//        // 通过客户端执行请求
//        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
//        // 输出请求
//        System.out.println(response.status());
//    }
//    @Test
//    public void searchESDocumentDetails() throws IOException {
//        // 创建索引相关请求
//        GetRequest request = new GetRequest("springboot-sca1", "mABe7H4BbP4NHg5hcWo7");
//        // 获取文档信息
//        GetResponse response = restHighLevelClient.get(request, RequestOptions.DEFAULT);
//        // 输出具体数据
//        System.out.println(response.getSourceAsString());
//
//    }
//}
