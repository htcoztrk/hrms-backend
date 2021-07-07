package kodlamaio.hrms.core.utilities.Business;

import kodlamaio.hrms.core.utilities.Results.Result;

public class BusinessRules {
  public static Result Run(Result... logics) {
	  for( Result logic : logics)
      {
          if (!logic.isSuccess())
          {
              return logic;
          }
      }
      return null;
  }
}
