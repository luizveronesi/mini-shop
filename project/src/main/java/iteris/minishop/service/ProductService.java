package iteris.minishop.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import iteris.minishop.domain.Product;
import iteris.minishop.repository.ProductRepository;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> list() {
        return productRepository.findAll();
    }

    public String upload(MultipartFile file, Integer id) {
		String dirName = File.separator + "temp";
		File dir = new File(dirName);
		if (!dir.exists()) dir.mkdir();
		
		String filename = file.getName();
		File destFile = new File(dir + File.separator + filename);
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);
		} catch (IOException e) {
			throw new RuntimeException(e);
        }
        
        return destFile.getName();
	}
}