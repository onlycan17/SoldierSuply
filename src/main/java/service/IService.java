package service;

import java.util.List;

public interface IService {

    <T>void download(List<T> dataList, String fileName);
}
