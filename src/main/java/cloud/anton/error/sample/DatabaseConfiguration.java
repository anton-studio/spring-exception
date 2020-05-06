/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-31 01:19
 */
package cloud.anton.error.sample;

import cloud.anton.error.sample.database.MySQL;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
//    @Value("${mysql.ip}")
    private String ip;

//    @Value("${mysql.port}")
    private Integer port;

//    @Bean
    public IConnect mysql() {
        return new MySQL(this.ip, this.port);
    }
}
