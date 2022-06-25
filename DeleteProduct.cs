using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Text;

namespace Automated_product_management_program
{
    class DeleteProduct
    {
        public void RemoveProduct(int id)
        {
            SqlConnection connection = new ConnectionDb().GetData();
            connection.Open();
            SqlCommand command = new SqlCommand("DELETE FROM product WHERE id =@id", connection);
            command.Parameters.AddWithValue("@id", id);
            int check = command.ExecuteNonQuery();
            if(check > 0)
            {
                Console.WriteLine("Delete success {0} product", check);
            }
            else { Console.WriteLine("Delete false!"); }
            connection.Close();
        }
    }
}
