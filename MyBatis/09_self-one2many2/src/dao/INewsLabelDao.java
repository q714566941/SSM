package dao;


import beans.NewsLabel;

//查询当前栏目及其所有父类栏目
public interface INewsLabelDao {
	NewsLabel selectNewsLabelById(int id);
}
