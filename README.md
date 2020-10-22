# WebServer
androidStudio远程地址：com.github.lmq-97:WebServer:v1.0
使用方法
Application中：
 new WebServiceConfigManager.Builder()
                .setBASE_URL("") 
//                .setBASE_URL("") 
                .setNAME_SPACE("") // 命名空间
                .setHEAD_PAGE("") // 页面
                .build();
                
                
                public class TestWs extends BaseWebService {
    private String byProvinceName;

    public String getByProvinceName() {
        return byProvinceName;
    }

    public void setByProvinceName(String byProvinceName) {
        this.byProvinceName = byProvinceName;
    }

    @Override
    public Map<String, String> setParamMap() {
        Map<String, String> map = new HashMap<>();
        // 查询参数
        return map;
    }

    @Override
    public String setMethod() {
        return ""; // 查询方法
    }
}       
        
        使用的地方初始化就可以了
        TestWs ws = new TestWs();
        ws.getRequest()
                // 处理相应的实体转换
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) throws Exception {
                        return new Object();
                    }
                }).subscribe(new Observer<Object>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("进入方法onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("进入方法onNext" + o);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("进入方法onError" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("进入方法onComplete");
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
