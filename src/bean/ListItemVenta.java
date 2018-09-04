package bean;

import java.util.ArrayList;
import java.util.List;

import bean.dao.HibernateClienteDAO;



public class ListItemVenta 
{
	private List<ItemVenta> ItemsVenta;
	
	public ListItemVenta()
	{
		ItemsVenta= new ArrayList<ItemVenta>();
		}

	public List<ItemVenta> getClientes() {
		return ItemsVenta;
	}
	
	public void setItemsVenta(List<ItemVenta> ItemsVenta) {
		this.ItemsVenta = ItemsVenta;
	}
	
	public void addCliente(ItemVenta ItemVenta){
		ItemsVenta.add(ItemVenta);
	}
	
	public boolean removeCliente(ItemVenta ItemVenta) {
		return ItemsVenta.remove(ItemVenta);
	}
	
	public float getTotalItemsVenta(){
		int total = 0;
		
		for(ItemVenta i : ItemsVenta){

			total = i.producto.getPrecio(); 
			
		}
		return total;
	}
		
	public int size(){
		return ItemsVenta.size();
	}

}