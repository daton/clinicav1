package org.unitec.clinicav1;


import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

@Configuration
public class MongConf {


    @Bean
    public SimpleMongoDbFactory mongoDbFactory()throws Exception{
        //  MongoURI uri=new MongoURI("mongodb://campitos-gcm:celiesita@paulo.mongohq.com:10037/campitos-base");
        MongoClientURI uri=new MongoClientURI("mongodb+srv://campitos:topoyiyo@cluster0-d36jf.mongodb.net/test");
        return new SimpleMongoDbFactory(uri);
    }

    @Bean
    public MongoTemplate mongoTemplate()throws Exception{
        MongoTemplate mongoTemplate=new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }


    /*
    @Bean
    public GridFsTemplate gridFsTemplate()throws Exception{
        return new GridFsTemplate(mongoDbFactory(),mappingMongoConverter());
    }
    */

}
