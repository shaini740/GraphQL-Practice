package com.example.graphql.Query;


import com.example.graphql.Request.FullNameRequest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Query {


    @QueryMapping
    public String firstQuery(){
        return "Hello";
    }

    @QueryMapping
    public String fullName(@Argument String firstName, @Argument String lastName){
        return "Hello "+firstName+" "+lastName;
    }

    @QueryMapping
    public String fullNameByRequest(@Argument FullNameRequest fullNameRequest){
        return "Hello, Good Morning "+fullNameRequest.getFirstName()+" "+fullNameRequest.getLastName();
    }


}
