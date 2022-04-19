package com.yalonso.interview.controllers;

import com.google.gson.Gson;
import com.yalonso.interview.models.Product;
import com.yalonso.interview.models.ProductResponse;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private static ProductController productControllerInstance;

    public static ProductController getInstance() {
        if (productControllerInstance == null) {
            productControllerInstance = new ProductController();
        }
        return productControllerInstance;
    }

    public List<Product> getProductList() {
        return getProducts().productData.products;
    }

    private ProductResponse getProducts() {
        Gson converter = new Gson();
        ProductResponse productResponse = converter.fromJson(jsonData, ProductResponse.class);
        return productResponse;
    }

    private String jsonData = "{\n" +
            "    \"data\": {\n" +
            "        \"num_found\": 63,\n" +
            "        \"start\": 0,\n" +
            "        \"did_you_mean\": [],\n" +
            "        \"products\": [{\n" +
            "            \"title\": \"Factory Authorized Parts™ - AZ2280-1A-24A Relay\",\n" +
            "            \"mpn\": \"AZ2280-1A-24A\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/rcd-parts_az2280-1a-24a_article_1408712821373_en_normal\",\n" +
            "            \"inventory\": 52,\n" +
            "            \"item_id\": \"AZ2280-1A-24A\",\n" +
            "            \"heiler_num\": \"1408712821373\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1408712821373\",\n" +
            "            \"has_supersedes\": true,\n" +
            "            \"product_num\": \"AZ2280-1A-24A\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC430A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc430a003_article_1429461218622_en_normal\",\n" +
            "            \"inventory\": 234,\n" +
            "            \"item_id\": \"24ACC430A003\",\n" +
            "            \"heiler_num\": \"1429461218622\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218622\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC430A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC436A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc436a003_article_1429461218334_en_normal\",\n" +
            "            \"inventory\": 186,\n" +
            "            \"item_id\": \"24ACC436A003\",\n" +
            "            \"heiler_num\": \"1429461218334\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218334\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC436A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC424A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc424a003_article_1429461218537_en_normal\",\n" +
            "            \"inventory\": 186,\n" +
            "            \"item_id\": \"24ACC424A003\",\n" +
            "            \"heiler_num\": \"1429461218537\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218537\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC424A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC636A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc636a003_article_1391689335268_en_normal\",\n" +
            "            \"inventory\": 95,\n" +
            "            \"item_id\": \"24ABC636A003\",\n" +
            "            \"heiler_num\": \"1391689335268\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689335268\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC636A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC648A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc648a003_article_1391689337098_en_normal\",\n" +
            "            \"inventory\": 17,\n" +
            "            \"item_id\": \"24ABC648A003\",\n" +
            "            \"heiler_num\": \"1391689337098\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689337098\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC648A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2.5 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC630A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc630a003_article_1391689337751_en_normal\",\n" +
            "            \"inventory\": 131,\n" +
            "            \"item_id\": \"24ABC630A003\",\n" +
            "            \"heiler_num\": \"1391689337751\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689337751\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC630A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 3 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACB736A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acb736a003_article_1391689339257_en_normal\",\n" +
            "            \"inventory\": 117,\n" +
            "            \"item_id\": \"24ACB736A003\",\n" +
            "            \"heiler_num\": \"1391689339257\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689339257\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACB736A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC442A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc442a003_article_1429461218496_en_normal\",\n" +
            "            \"inventory\": 146,\n" +
            "            \"item_id\": \"24ACC442A003\",\n" +
            "            \"heiler_num\": \"1429461218496\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218496\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC442A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC642A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc642a003_article_1391689338071_en_normal\",\n" +
            "            \"inventory\": 48,\n" +
            "            \"item_id\": \"24ABC642A003\",\n" +
            "            \"heiler_num\": \"1391689338071\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689338071\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC642A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC660B003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/na_24abc660b003_article_7407364701315185_en_normal\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"24ABC660B003\",\n" +
            "            \"heiler_num\": \"7407364701315185\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"7407364701315185\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC660B003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC448A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc448a003_article_1429461218262_en_normal\",\n" +
            "            \"inventory\": 84,\n" +
            "            \"item_id\": \"24ACC448A003\",\n" +
            "            \"heiler_num\": \"1429461218262\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218262\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC448A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC624A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc624a003_article_1391689335863_en_normal\",\n" +
            "            \"inventory\": 184,\n" +
            "            \"item_id\": \"24ABC624A003\",\n" +
            "            \"heiler_num\": \"1391689335863\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689335863\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC624A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 4 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACB748A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acb748a003_article_1391689334308_en_normal\",\n" +
            "            \"inventory\": 114,\n" +
            "            \"item_id\": \"24ACB748A003\",\n" +
            "            \"heiler_num\": \"1391689334308\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689334308\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACB748A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC460A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc460a003_article_1429461218352_en_normal\",\n" +
            "            \"inventory\": 85,\n" +
            "            \"item_id\": \"24ACC460A003\",\n" +
            "            \"heiler_num\": \"1429461218352\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218352\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC460A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA424C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca424c003_article_1457084021565_en_normal\",\n" +
            "            \"inventory\": 220,\n" +
            "            \"item_id\": \"24ACA424C003\",\n" +
            "            \"heiler_num\": \"1457084021565\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084021565\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA424C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 5 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACB760AB03\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acb760ab03_article_1470385930373_en_normal\",\n" +
            "            \"inventory\": 88,\n" +
            "            \"item_id\": \"24ACB760AB03\",\n" +
            "            \"heiler_num\": \"1470385930373\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1470385930373\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACB760AB03\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 4 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB648A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb648a003_article_678573465979253_en_normal\",\n" +
            "            \"inventory\": 72,\n" +
            "            \"item_id\": \"24APB648A003\",\n" +
            "            \"heiler_num\": \"678573465979253\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979253\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB648A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2.5 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA430C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca430c003_article_1457084020945_en_normal\",\n" +
            "            \"inventory\": 99,\n" +
            "            \"item_id\": \"24ACA430C003\",\n" +
            "            \"heiler_num\": \"1457084020945\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084020945\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA430C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 3 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB636A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb636a003_article_678573465979599_en_normal\",\n" +
            "            \"inventory\": 34,\n" +
            "            \"item_id\": \"24APB636A003\",\n" +
            "            \"heiler_num\": \"678573465979599\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979599\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB636A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 2.5 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB630A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb630a003_article_678573465979193_en_normal\",\n" +
            "            \"inventory\": 45,\n" +
            "            \"item_id\": \"24APB630A003\",\n" +
            "            \"heiler_num\": \"678573465979193\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979193\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB630A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 1.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC418A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acc418a003_article_1429461218479_en_normal\",\n" +
            "            \"inventory\": 54,\n" +
            "            \"item_id\": \"24ACC418A003\",\n" +
            "            \"heiler_num\": \"1429461218479\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1429461218479\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC418A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 2 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACB724A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24acb724a003_article_1391689338911_en_normal\",\n" +
            "            \"inventory\": 7,\n" +
            "            \"item_id\": \"24ACB724A003\",\n" +
            "            \"heiler_num\": \"1391689338911\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689338911\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACB724A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 1.5 Ton 16 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ABC618A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abc618a003_article_1391689337627_en_normal\",\n" +
            "            \"inventory\": 62,\n" +
            "            \"item_id\": \"24ABC618A003\",\n" +
            "            \"heiler_num\": \"1391689337627\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689337627\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABC618A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 3 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA436A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha436a003_article_1426278595016_en_normal\",\n" +
            "            \"inventory\": 5,\n" +
            "            \"item_id\": \"24AHA436A003\",\n" +
            "            \"heiler_num\": \"1426278595016\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278595016\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA436A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 3.5 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB642A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb642a003_article_678573465979539_en_normal\",\n" +
            "            \"inventory\": 26,\n" +
            "            \"item_id\": \"24APB642A003\",\n" +
            "            \"heiler_num\": \"678573465979539\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979539\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB642A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 13 SEER Air Conditioner Condensing Unit (208/230-3)\",\n" +
            "            \"mpn\": \"24ABB360A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb360a005_article_1391689332514_en_normal\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"24ABB360A005\",\n" +
            "            \"heiler_num\": \"1391689332514\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689332514\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB360A005\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 2 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA424A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha424a003_article_1426278594907_en_normal\",\n" +
            "            \"inventory\": 1,\n" +
            "            \"item_id\": \"24AHA424A003\",\n" +
            "            \"heiler_num\": \"1426278594907\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278594907\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA424A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA436C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca436c003_article_1457084021904_en_normal\",\n" +
            "            \"inventory\": 84,\n" +
            "            \"item_id\": \"24ACA436C003\",\n" +
            "            \"heiler_num\": \"1457084021904\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084021904\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA436C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 2.5 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA430A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha430a003_article_1426278595162_en_normal\",\n" +
            "            \"inventory\": 1,\n" +
            "            \"item_id\": \"24AHA430A003\",\n" +
            "            \"heiler_num\": \"1426278595162\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278595162\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA430A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 5 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB660A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb660a003_article_678573465979419_en_normal\",\n" +
            "            \"inventory\": 4,\n" +
            "            \"item_id\": \"24APB660A003\",\n" +
            "            \"heiler_num\": \"678573465979419\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979419\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB660A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 2 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB624A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb624a003_article_678573465979479_en_normal\",\n" +
            "            \"inventory\": 26,\n" +
            "            \"item_id\": \"24APB624A003\",\n" +
            "            \"heiler_num\": \"678573465979479\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979479\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB624A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Infinity™ - 4 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit\",\n" +
            "            \"mpn\": \"24ANB748C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24anb748c003_article_1391689332582_en_normal\",\n" +
            "            \"inventory\": 22,\n" +
            "            \"item_id\": \"24ANB748C003\",\n" +
            "            \"heiler_num\": \"1391689332582\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689332582\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ANB748C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA442C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca442c003_article_1457084022025_en_normal\",\n" +
            "            \"inventory\": 58,\n" +
            "            \"item_id\": \"24ACA442C003\",\n" +
            "            \"heiler_num\": \"1457084022025\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084022025\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA442C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 1.5 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA418C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca418c003_article_1457084021318_en_normal\",\n" +
            "            \"inventory\": 81,\n" +
            "            \"item_id\": \"24ACA418C003\",\n" +
            "            \"heiler_num\": \"1457084021318\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084021318\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA418C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 1.5 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA418A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha418a003_article_1426278594927_en_normal\",\n" +
            "            \"inventory\": 2,\n" +
            "            \"item_id\": \"24AHA418A003\",\n" +
            "            \"heiler_num\": \"1426278594927\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278594927\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA418A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 5 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA460A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha460a003_article_1426278595300_en_normal\",\n" +
            "            \"inventory\": 1,\n" +
            "            \"item_id\": \"24AHA460A003\",\n" +
            "            \"heiler_num\": \"1426278595300\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278595300\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA460A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 13 SEER Air Conditioner Condensing Unit (460-3)\",\n" +
            "            \"mpn\": \"24ABB360A006\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb360a006_article_1391689338919_en_normal\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"24ABB360A006\",\n" +
            "            \"heiler_num\": \"1391689338919\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689338919\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB360A006\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 4 Ton 14 SEER Residential Horizontal Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24AHA448A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha448a003_article_1426278595336_en_normal\",\n" +
            "            \"inventory\": 2,\n" +
            "            \"item_id\": \"24AHA448A003\",\n" +
            "            \"heiler_num\": \"1426278595336\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278595336\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA448A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA448C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca448c003_article_1457084022195_en_normal\",\n" +
            "            \"inventory\": 43,\n" +
            "            \"item_id\": \"24ACA448C003\",\n" +
            "            \"heiler_num\": \"1457084022195\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084022195\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA448C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2.5 Ton 13 SEER Air Conditioning Condenser (208/230-3)\",\n" +
            "            \"mpn\": \"24ABB330A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb330a005_article_1391689337127_en_normal\",\n" +
            "            \"inventory\": 10,\n" +
            "            \"item_id\": \"24ABB330A005\",\n" +
            "            \"heiler_num\": \"1391689337127\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689337127\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB330A005\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Infinity™ - 3 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit\",\n" +
            "            \"mpn\": \"24ANB736C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24anb736c003_article_1391689332760_en_normal\",\n" +
            "            \"inventory\": 12,\n" +
            "            \"item_id\": \"24ANB736C003\",\n" +
            "            \"heiler_num\": \"1391689332760\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689332760\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ANB736C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 13 SEER Air Conditioning Condenser (208/230-3)\",\n" +
            "            \"mpn\": \"24ABB348A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb348a005_article_1391689332989_en_normal\",\n" +
            "            \"inventory\": 17,\n" +
            "            \"item_id\": \"24ABB348A005\",\n" +
            "            \"heiler_num\": \"1391689332989\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689332989\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB348A005\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Factory Authorized Parts™ - HN61PC006 Relay\",\n" +
            "            \"mpn\": \"HN61PC006\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/rcd-parts_hn61pc006_article_1408712814020_en_normal\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"HN61PC006\",\n" +
            "            \"heiler_num\": \"1408712814020\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1408712814020\",\n" +
            "            \"has_supersedes\": true,\n" +
            "            \"product_num\": \"HN61PC006\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 1.5 Ton 16 SEER Air Conditioning Condenser\",\n" +
            "            \"mpn\": \"24APB618A003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24apb618a003_article_678573465979359_en_normal\",\n" +
            "            \"inventory\": 9,\n" +
            "            \"item_id\": \"24APB618A003\",\n" +
            "            \"heiler_num\": \"678573465979359\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"678573465979359\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24APB618A003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Performance™ - 4 Ton 14 SEER Horizontal Air Conditioner Condensing Unit  (208/230-3)\",\n" +
            "            \"mpn\": \"24AHA448A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aha448a005_article_1426278595112_en_normal\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24AHA448A005\",\n" +
            "            \"heiler_num\": \"1426278595112\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1426278595112\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24AHA448A005\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 14 SEER Residential Air Conditioner Condensing Unit Coastal\",\n" +
            "            \"mpn\": \"24ACA460C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24aca460c003_article_1457084022365_en_normal\",\n" +
            "            \"inventory\": 29,\n" +
            "            \"item_id\": \"24ACA460C003\",\n" +
            "            \"heiler_num\": \"1457084022365\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1457084022365\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACA460C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 13 SEER Air Conditioning Condenser (208/230-3)\",\n" +
            "            \"mpn\": \"24ABB336A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb336a005_article_1391689335607_en_normal\",\n" +
            "            \"inventory\": 16,\n" +
            "            \"item_id\": \"24ABB336A005\",\n" +
            "            \"heiler_num\": \"1391689335607\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689335607\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB336A005\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Infinity™ - 5 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit\",\n" +
            "            \"mpn\": \"24ANB760CB03\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24anb760cb03_article_1470385930556_en_normal\",\n" +
            "            \"inventory\": 13,\n" +
            "            \"item_id\": \"24ANB760CB03\",\n" +
            "            \"heiler_num\": \"1470385930556\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1470385930556\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ANB760CB03\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 13 SEER Air Conditioning Condenser (460-3)\",\n" +
            "            \"mpn\": \"24ABB348A006\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb348a006_article_1391689338384_en_normal\",\n" +
            "            \"inventory\": 13,\n" +
            "            \"item_id\": \"24ABB348A006\",\n" +
            "            \"heiler_num\": \"1391689338384\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689338384\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB348A006\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 13 SEER Air Conditioning Condenser (208/230-3)\",\n" +
            "            \"mpn\": \"24ABB342A005\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb342a005_article_1391689335747_en_normal\",\n" +
            "            \"inventory\": 9,\n" +
            "            \"item_id\": \"24ABB342A005\",\n" +
            "            \"heiler_num\": \"1391689335747\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689335747\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB342A005\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Infinity™ - 2 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit\",\n" +
            "            \"mpn\": \"24ANB724C003\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24anb724c003_article_1391689334474_en_normal\",\n" +
            "            \"inventory\": 16,\n" +
            "            \"item_id\": \"24ANB724C003\",\n" +
            "            \"heiler_num\": \"1391689334474\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689334474\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ANB724C003\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 13 SEER Air Conditioning Condenser (460-3)\",\n" +
            "            \"mpn\": \"24ABB336A006\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb336a006_article_1391689334079_en_normal\",\n" +
            "            \"inventory\": 14,\n" +
            "            \"item_id\": \"24ABB336A006\",\n" +
            "            \"heiler_num\": \"1391689334079\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689334079\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB336A006\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 13 SEER Air Conditioning Condenser (460-3)\",\n" +
            "            \"mpn\": \"24ABB342A006\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/carrier_24abb342a006_article_1391689334309_en_normal\",\n" +
            "            \"inventory\": 6,\n" +
            "            \"item_id\": \"24ABB342A006\",\n" +
            "            \"heiler_num\": \"1391689334309\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1391689334309\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ABB342A006\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 1.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC418A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC418A0L3\",\n" +
            "            \"heiler_num\": \"1604089090859936\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089090859936\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC418A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC424A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC424A0L3\",\n" +
            "            \"heiler_num\": \"1604089091169337\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089091169337\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC424A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC436A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC436A0L3\",\n" +
            "            \"heiler_num\": \"1604089091169338\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089091169338\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC436A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Factory Authorized Parts™ - PRD5AYO-24AC\",\n" +
            "            \"mpn\": \"PRD5AYO-24AC\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"PRD5AYO-24AC\",\n" +
            "            \"heiler_num\": \"12944793859477503\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"12944793859477503\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"PRD5AYO-24AC\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Factory Authorized Parts™ - PRD11AYO-24AC\",\n" +
            "            \"mpn\": \"PRD11AYO-24AC\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": 0,\n" +
            "            \"item_id\": \"PRD11AYO-24AC\",\n" +
            "            \"heiler_num\": \"12944793859428653\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"12944793859428653\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"PRD11AYO-24AC\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": [{\n" +
            "                \"name\": \"Factory Direct Ship\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }, {\n" +
            "                \"name\": \"No Returns\",\n" +
            "                \"color\": \"#FF0000\"\n" +
            "            }]\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 2.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC430A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC430A0L3\",\n" +
            "            \"heiler_num\": \"1604089091169340\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089091169340\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC430A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC460A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC460A0L3\",\n" +
            "            \"heiler_num\": \"1604089090859932\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089090859932\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC460A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 4 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC448A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC448A0L3\",\n" +
            "            \"heiler_num\": \"1604089091169339\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089091169339\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC448A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }, {\n" +
            "            \"title\": \"Carrier® Comfort™ - 3.5 Ton 14 SEER Residential Air Conditioner Condensing Unit\",\n" +
            "            \"mpn\": \"24ACC442A0L3\",\n" +
            "            \"image_url\": \"https://resource.carrierenterprise.com/is/image/Watscocom/__missing__\",\n" +
            "            \"inventory\": null,\n" +
            "            \"item_id\": \"24ACC442A0L3\",\n" +
            "            \"heiler_num\": \"1604089090859943\",\n" +
            "            \"product_type\": \"simple\",\n" +
            "            \"product_id\": \"1604089090859943\",\n" +
            "            \"has_supersedes\": false,\n" +
            "            \"product_num\": \"24ACC442A0L3\",\n" +
            "            \"brand\": \"Carrier\",\n" +
            "            \"call_outs\": []\n" +
            "        }],\n" +
            "        \"items_count\": 63\n" +
            "    }\n" +
            "}";

}
