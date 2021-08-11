package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.adapters.CloudService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.ErrorResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	private CloudService cloudService;
	private UserService userService;
	
	@Autowired
	public ImageManager(ImageDao imageDao, CloudService cloudService, UserService userService) {
		super();
		this.imageDao = imageDao;
		this.cloudService = cloudService;
		this.userService = userService;
	}
	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Image> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Image> getByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result add(MultipartFile multipartFile) {
		var result=this.cloudService.upload(multipartFile);
		if(result.isSuccess()) {
			return new ErrorResult();
		}
		Image image=new Image();
		image.setImageUrl(result.getData().get("url"));
		image.setUploadedDate(result.getData().get("created_at"));
		this.imageDao.save(image);
		return new SuccessResult("photo added");
	}
	@Override
	public Result update(MultipartFile multipartFile) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
