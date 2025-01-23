package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Generator;
import generator.service.GeneratorService;
import generator.mapper.GeneratorMapper;
import org.springframework.stereotype.Service;

/**
* @author 17626
* @description 针对表【generator(代码生成器)】的数据库操作Service实现
* @createDate 2025-01-21 13:47:34
*/
@Service
public class GeneratorServiceImpl extends ServiceImpl<GeneratorMapper, Generator>
    implements GeneratorService{

}




