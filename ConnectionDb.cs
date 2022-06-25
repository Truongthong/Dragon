using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Text;

namespace Automated_product_management_program
{
    public class ConnectionDb
    {
        public SqlConnection GetData()
        {
            string connectionString = "Data source = localhost; Initial Catalog = DbTest ; User = sa ; password = sa ; ";
            SqlConnection conn = new SqlConnection(connectionString);

            return conn;
        }
    }
}
