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
	
	public void addItemVenta(ItemVenta ItemVenta){
		ItemsVenta.add(ItemVenta);
	}
	
	public boolean removeCliente(ItemVenta ItemVenta) {
		return ItemsVenta.remove(ItemVenta);
	}
	
	public float getTotalItemsVenta(){
		float total = 0;
		
		for(ItemVenta i : ItemsVenta){

			total = total + (i.getProducto().getPrecio() * i.getCantidad());
			
		}
		return total;
	}
		
	public int size(){
		return ItemsVenta.size();
	}

}
